/**
 * ConnectorContentTypeLinkParamList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class ConnectorContentTypeLinkParamList  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLinkParam[] connectorContentTypeLinkParam;

    public ConnectorContentTypeLinkParamList() {
    }

    public ConnectorContentTypeLinkParamList(
           com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLinkParam[] connectorContentTypeLinkParam) {
           this.connectorContentTypeLinkParam = connectorContentTypeLinkParam;
    }


    /**
     * Gets the connectorContentTypeLinkParam value for this ConnectorContentTypeLinkParamList.
     * 
     * @return connectorContentTypeLinkParam
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLinkParam[] getConnectorContentTypeLinkParam() {
        return connectorContentTypeLinkParam;
    }


    /**
     * Sets the connectorContentTypeLinkParam value for this ConnectorContentTypeLinkParamList.
     * 
     * @param connectorContentTypeLinkParam
     */
    public void setConnectorContentTypeLinkParam(com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLinkParam[] connectorContentTypeLinkParam) {
        this.connectorContentTypeLinkParam = connectorContentTypeLinkParam;
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLinkParam getConnectorContentTypeLinkParam(int i) {
        return this.connectorContentTypeLinkParam[i];
    }

    public void setConnectorContentTypeLinkParam(int i, com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLinkParam _value) {
        this.connectorContentTypeLinkParam[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConnectorContentTypeLinkParamList)) return false;
        ConnectorContentTypeLinkParamList other = (ConnectorContentTypeLinkParamList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.connectorContentTypeLinkParam==null && other.getConnectorContentTypeLinkParam()==null) || 
             (this.connectorContentTypeLinkParam!=null &&
              java.util.Arrays.equals(this.connectorContentTypeLinkParam, other.getConnectorContentTypeLinkParam())));
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
        if (getConnectorContentTypeLinkParam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConnectorContentTypeLinkParam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConnectorContentTypeLinkParam(), i);
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
        new org.apache.axis.description.TypeDesc(ConnectorContentTypeLinkParamList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector-content-type-link-param-list"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectorContentTypeLinkParam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connectorContentTypeLinkParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector-content-type-link-param"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
