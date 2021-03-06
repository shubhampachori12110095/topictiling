

/* First created by JCasGen Thu Apr 12 12:36:03 CEST 2012 */
package de.tudarmstadt.langtech.lda.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.DoubleArray;


/** 
 * Updated by JCasGen Thu Apr 12 12:36:03 CEST 2012
 * XML source: /home/riedl/work/workspace/de.tudarmstadt.ukp.dkpro.lda/src/main/resources/desc/type/gibbsldatypes.xml
 * @generated */
public class WordTopicDistribution extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(WordTopicDistribution.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected WordTopicDistribution() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public WordTopicDistribution(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public WordTopicDistribution(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public WordTopicDistribution(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: topicDistribution

  /** getter for topicDistribution - gets 
   * @generated */
  public DoubleArray getTopicDistribution() {
    if (WordTopicDistribution_Type.featOkTst && ((WordTopicDistribution_Type)jcasType).casFeat_topicDistribution == null)
      jcasType.jcas.throwFeatMissing("topicDistribution", "de.tudarmstadt.ukp.dkpro.lda.type.WordTopicDistribution");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((WordTopicDistribution_Type)jcasType).casFeatCode_topicDistribution)));}
    
  /** setter for topicDistribution - sets  
   * @generated */
  public void setTopicDistribution(DoubleArray v) {
    if (WordTopicDistribution_Type.featOkTst && ((WordTopicDistribution_Type)jcasType).casFeat_topicDistribution == null)
      jcasType.jcas.throwFeatMissing("topicDistribution", "de.tudarmstadt.ukp.dkpro.lda.type.WordTopicDistribution");
    jcasType.ll_cas.ll_setRefValue(addr, ((WordTopicDistribution_Type)jcasType).casFeatCode_topicDistribution, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for topicDistribution - gets an indexed value - 
   * @generated */
  public double getTopicDistribution(int i) {
    if (WordTopicDistribution_Type.featOkTst && ((WordTopicDistribution_Type)jcasType).casFeat_topicDistribution == null)
      jcasType.jcas.throwFeatMissing("topicDistribution", "de.tudarmstadt.ukp.dkpro.lda.type.WordTopicDistribution");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((WordTopicDistribution_Type)jcasType).casFeatCode_topicDistribution), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((WordTopicDistribution_Type)jcasType).casFeatCode_topicDistribution), i);}

  /** indexed setter for topicDistribution - sets an indexed value - 
   * @generated */
  public void setTopicDistribution(int i, double v) { 
    if (WordTopicDistribution_Type.featOkTst && ((WordTopicDistribution_Type)jcasType).casFeat_topicDistribution == null)
      jcasType.jcas.throwFeatMissing("topicDistribution", "de.tudarmstadt.ukp.dkpro.lda.type.WordTopicDistribution");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((WordTopicDistribution_Type)jcasType).casFeatCode_topicDistribution), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((WordTopicDistribution_Type)jcasType).casFeatCode_topicDistribution), i, v);}
  }

    