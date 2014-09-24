/**
 * ConnectorContentTypeLinkList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class ConnectorContentTypeLinkList  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLink[] connectorContentTypeLink;

    public ConnectorContentTypeLinkList() {
    }

    public ConnectorContentTypeLinkList(
           com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLink[] connectorContentTypeLink) {
           this.connectorContentTypeLink = connectorContentTypeLink;
    }


    /**
     * Gets the connectorContentTypeLink value for this ConnectorContentTypeLinkList.
     * 
     * @return connectorContentTypeLink
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLink[] getConnectorContentTypeLink() {
        return connectorContentTypeLink;
    }


    /**
     * Sets the connectorContentTypeLink value for this ConnectorContentTypeLinkList.
     * 
     * @param connectorContentTypeLink
     */
    public void setConnectorContentTypeLink(com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLink[] connectorContentTypeLink) {
        this.connectorContentTypeLink = connectorContentTypeLink;
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLink getConnectorContentTypeLink(int i) {
        return this.connectorContentTypeLink[i];
    }

    public void setConnectorContentTypeLink(int i, com.hannonhill.www.ws.ns.AssetOperationService.ConnectorContentTypeLink _value) {
        this.connectorContentTypeLink[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConnectorContentTypeLinkList)) return false;
        ConnectorContentTypeLinkList other = (ConnectorContentTypeLinkList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.connectorContentTypeLink==null && other.getConnectorContentTypeLink()==null) || 
             (this.connectorContentTypeLink!=null &&
              java.util.Arrays.equals(this.connectorContentTypeLink, other.getConnectorContentTypeLink())));
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
        if (getConnectorContentTypeLink() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConnectorContentTypeLink());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConnectorContentTypeLink(), i);
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
        new org.apache.axis.description.TypeDesc(ConnectorContentTypeLinkList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector-content-type-link-list"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectorContentTypeLink");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connectorContentTypeLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "connector-content-type-link"));
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
