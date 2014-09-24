/**
 * WorkflowStepConfigurations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class WorkflowStepConfigurations  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStepConfiguration[] workflowStepConfiguration;

    public WorkflowStepConfigurations() {
    }

    public WorkflowStepConfigurations(
           com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStepConfiguration[] workflowStepConfiguration) {
           this.workflowStepConfiguration = workflowStepConfiguration;
    }


    /**
     * Gets the workflowStepConfiguration value for this WorkflowStepConfigurations.
     * 
     * @return workflowStepConfiguration
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStepConfiguration[] getWorkflowStepConfiguration() {
        return workflowStepConfiguration;
    }


    /**
     * Sets the workflowStepConfiguration value for this WorkflowStepConfigurations.
     * 
     * @param workflowStepConfiguration
     */
    public void setWorkflowStepConfiguration(com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStepConfiguration[] workflowStepConfiguration) {
        this.workflowStepConfiguration = workflowStepConfiguration;
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStepConfiguration getWorkflowStepConfiguration(int i) {
        return this.workflowStepConfiguration[i];
    }

    public void setWorkflowStepConfiguration(int i, com.hannonhill.www.ws.ns.AssetOperationService.WorkflowStepConfiguration _value) {
        this.workflowStepConfiguration[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowStepConfigurations)) return false;
        WorkflowStepConfigurations other = (WorkflowStepConfigurations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workflowStepConfiguration==null && other.getWorkflowStepConfiguration()==null) || 
             (this.workflowStepConfiguration!=null &&
              java.util.Arrays.equals(this.workflowStepConfiguration, other.getWorkflowStepConfiguration())));
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
        if (getWorkflowStepConfiguration() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkflowStepConfiguration());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkflowStepConfiguration(), i);
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
        new org.apache.axis.description.TypeDesc(WorkflowStepConfigurations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflow-step-configurations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowStepConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflowStepConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "workflow-step-configuration"));
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
