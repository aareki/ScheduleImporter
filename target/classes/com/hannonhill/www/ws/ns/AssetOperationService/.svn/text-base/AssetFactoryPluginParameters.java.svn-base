/**
 * AssetFactoryPluginParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class AssetFactoryPluginParameters  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPluginParameter[] parameter;

    public AssetFactoryPluginParameters() {
    }

    public AssetFactoryPluginParameters(
           com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPluginParameter[] parameter) {
           this.parameter = parameter;
    }


    /**
     * Gets the parameter value for this AssetFactoryPluginParameters.
     * 
     * @return parameter
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPluginParameter[] getParameter() {
        return parameter;
    }


    /**
     * Sets the parameter value for this AssetFactoryPluginParameters.
     * 
     * @param parameter
     */
    public void setParameter(com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPluginParameter[] parameter) {
        this.parameter = parameter;
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPluginParameter getParameter(int i) {
        return this.parameter[i];
    }

    public void setParameter(int i, com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPluginParameter _value) {
        this.parameter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssetFactoryPluginParameters)) return false;
        AssetFactoryPluginParameters other = (AssetFactoryPluginParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parameter==null && other.getParameter()==null) || 
             (this.parameter!=null &&
              java.util.Arrays.equals(this.parameter, other.getParameter())));
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
        if (getParameter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameter(), i);
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
        new org.apache.axis.description.TypeDesc(AssetFactoryPluginParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset-factory-plugin-parameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "parameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset-factory-plugin-parameter"));
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
