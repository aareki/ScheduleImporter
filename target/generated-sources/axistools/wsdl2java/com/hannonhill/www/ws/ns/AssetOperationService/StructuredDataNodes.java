/**
 * StructuredDataNodes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class StructuredDataNodes  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode[] structuredDataNode;

    public StructuredDataNodes() {
    }

    public StructuredDataNodes(
           com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode[] structuredDataNode) {
           this.structuredDataNode = structuredDataNode;
    }


    /**
     * Gets the structuredDataNode value for this StructuredDataNodes.
     * 
     * @return structuredDataNode
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode[] getStructuredDataNode() {
        return structuredDataNode;
    }


    /**
     * Sets the structuredDataNode value for this StructuredDataNodes.
     * 
     * @param structuredDataNode
     */
    public void setStructuredDataNode(com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode[] structuredDataNode) {
        this.structuredDataNode = structuredDataNode;
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode getStructuredDataNode(int i) {
        return this.structuredDataNode[i];
    }

    public void setStructuredDataNode(int i, com.hannonhill.www.ws.ns.AssetOperationService.StructuredDataNode _value) {
        this.structuredDataNode[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StructuredDataNodes)) return false;
        StructuredDataNodes other = (StructuredDataNodes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.structuredDataNode==null && other.getStructuredDataNode()==null) || 
             (this.structuredDataNode!=null &&
              java.util.Arrays.equals(this.structuredDataNode, other.getStructuredDataNode())));
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
        if (getStructuredDataNode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStructuredDataNode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStructuredDataNode(), i);
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
        new org.apache.axis.description.TypeDesc(StructuredDataNodes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structured-data-nodes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("structuredDataNode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structuredDataNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "structured-data-node"));
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
