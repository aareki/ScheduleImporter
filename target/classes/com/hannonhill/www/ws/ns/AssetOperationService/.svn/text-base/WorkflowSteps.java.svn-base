/**
 * WorkflowSteps.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class WorkflowSteps  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStep[] step;

    public WorkflowSteps() {
    }

    public WorkflowSteps(
           com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStep[] step) {
           this.step = step;
    }


    /**
     * Gets the step value for this WorkflowSteps.
     * 
     * @return step
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStep[] getStep() {
        return step;
    }


    /**
     * Sets the step value for this WorkflowSteps.
     * 
     * @param step
     */
    public void setStep(com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStep[] step) {
        this.step = step;
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStep getStep(int i) {
        return this.step[i];
    }

    public void setStep(int i, com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStep _value) {
        this.step[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowSteps)) return false;
        WorkflowSteps other = (WorkflowSteps) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.step==null && other.getStep()==null) || 
             (this.step!=null &&
              java.util.Arrays.equals(this.step, other.getStep())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getStep() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStep());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStep(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowSteps.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowSteps"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("step");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "step"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowStep"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
