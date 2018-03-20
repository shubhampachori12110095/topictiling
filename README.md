# TopicTiling

Topic Tiling is a LDA based Text Segmentation algorithm. 
This algorithm is based on the well-known TextTiling 
algorithm developed by Marti Hearst, and segments documents using the Latent 
Dirichlet Allocation (LDA) topic model. TopicTiling performs 
the segmentation in linear time and thus is computationally 
less expensive than other LDA-based segmentation methods. 

For the LDA computation we use [JGibbLda](http://jgibblda.sourceforge.net/) and modified it slightly, making this project to be licenced under GPL.


Table of Content
================


  * [Usage of the binaries](#usage-of-the-binaries)
  * [Usage of the source code](#usage-of-the-source-code)
  * [Citation](#citation)
  * [License](#license)




Usage of the binaries
===============

The tool has been developed and tested using unix-based systems.
As TopicTiling is written in Java it should also run on Windows
machines. 

To start TopicTiling, you have to download the binary ([zip](https://github.com/riedlma/topictiling/releases/download/v1.0/topictiling_v1.0.zip)[tar.gz](https://github.com/riedlma/topictiling/releases/download/v1.0/topictiling_v1.0.tar.gz)) and decompress the archive. To execute the segmentation method, open the commandline and navigate to the uncompressed folder

```
cd topictiling_v1.0
```

We provide an batch script to start the segmentation for Windows:
```
bash topictiling.bat
```
and a shell script to start the segmentation for unix-based operation systems:
```
bash topictiling.sh
```

These commands will output all parameters of TopicTiling:


```
 [java] Option "-fd" is required
 [java] java -jar myprogram.jar [options...] arguments...
 [java]  -dn      : Use the direct neighbor otherwise the highest neighbor will be used
 [java]             (default false)
 [java]  -fd VAL  : Directory fo the test files
 [java]  -fp VAL  : File pattern for the test files
 [java]  -i N     : Number of inference iterations used to annotate words with topic
 [java]             IDs (default 100)
 [java]  -m       : Use mode counting (true/false) (default=true)
 [java]  -out VAL : File the content is written to (otherwise stdout will be used)
 [java]  -ri N    : Use the repeated inference method
 [java]  -rs N    : Use the repeated segmentation
 [java]  -s       : Use simple segmentation (default=false)
 [java]  -tmd VAL : Directory of the topic model (GibbsLDA should be used)
 [java]  -tmn VAL : Name of the topic model (GibbsLDA should be used)
 [java]  -w N     : Window size used to calculate the sentence similarity
```

In order to test TopicTiling, you also require a topic model that has been computed with either [JGibbLDA](http://jgibblda.sourceforge.net/) or [GibbsLda++](http://gibbslda.sourceforge.net/). Best practice is to compute the topic model on texts of the similar domain as the texts you plan to segment. As LDA is an unsupservised method you can also use the texts you want to segment. 

Once you have computed a topic model using GibbsLDA, you might have a folder called *topicmodel* with the files:
```
topicmodel/model-final.others
topicmodel/model-final.phi
topicmodel/model-final.tassign
topicmodel/model-final.theta
topicmodel/model-final.twords
topicmodel/wordmap.txt
```


For the segmentation, we advise we advise to repeat the inference five times (*-ri 5*). To start the segmentation, you can then use the following command, considering that the files you want to segment are stored in the folder *files_to_segment*:

```
sh topictiling.sh -ri 5 -tmd topicmodel -tmn mode-final -fp "[+]" -fd files_to_segment
```

The output of the algorithms is in XML format:

```
<document>
<documentName>…</documentName>
<segment>
<depthScore>score<depthScore>
<text>…</text>
</segment>
…

</document>
```

The code returns all maxima where a boundary might be set. If you know the number of segments, you can just select the N semgents with the highest depthScore scores. 


Usage of the source code
===============
Import both projects into Eclipse. The LDA project contains JGibbLda with slight modifications, so the mode method can be computed. Additionally it contains UIMA Annotators, so it can be used within a UIMA Pipeline. The project also has dependencies to DKPro and uimafit. To run the TopicTiling algorithm, execute the class TopicTilingTopicDocument. 

Citation
===============
If you use SECOS, please cite one of the following papers/article:

```

@inproceedings{riedl12_jlcl,
	author = {Martin Riedl and Chris Biemann},
	title = {TopicTiling: A Text Segmentation Algorithm based on LDA},
	year = {2012},
	address = {Jeju, Republic of Korea},
	booktitle = {Proceedings of the Student Research Workshop of the 50th Meeting of the Association for
               Computational Linguistics},
	pages = {37--42},
	url={www.jlcl.org/2012_Heft1/jlcl2012-1-3.pdf},
}

@inproceedings{riedl12_naacl,
	author = {Riedl, Martin and Biemann, Chris},
	title = {How Text Segmentation Algorithms Gain from Topic Models},
	year = {2012},
	address = {Montreal, Canada},
	booktitle = {Proceedings of the Conference of the North American Chapter of the
               Association for Computational Linguistics: Human Language Technologies},
	series={NAACL-HLT 2012},
	url={http://www.aclweb.org/anthology/N12-1064},
	pages={553--557 }
}
```



License
===============
TopicTiling is a free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation.

TopicTiling is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.


