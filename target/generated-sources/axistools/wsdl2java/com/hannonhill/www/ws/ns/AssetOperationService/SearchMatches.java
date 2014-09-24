/**
 * SearchMatches.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class SearchMatches  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] match;

    public SearchMatches() {
    }

    public SearchMatches(
           com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] match) {
           this.match = match;
    }


    /**
     * Gets the match value for this SearchMatches.
     * 
     * @return match
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] getMatch() {
        return match;
    }


    /**
     * Sets the match value for this SearchMatches.
     * 
     * @param match
     */
    public void setMatch(com.hannonhill.www.ws.ns.AssetOperationService.Identifier[] match) {
        this.match = match;
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.Identifier getMatch(int i) {
        return this.match[i];
    }

    public void setMatch(int i, com.hannonhill.www.ws.ns.AssetOperationService.Identifier _value) {
        this.match[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchMatches)) return false;
        SearchMatches other = (SearchMatches) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.match==null && other.getMatch()==null) || 
             (this.match!=null &&
              java.util.Arrays.equals(this.match, other.getMatch())));
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
        if (getMatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatch(), i);
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
        new org.apache.axis.description.TypeDesc(SearchMatches.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "search-matches"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("match");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "match"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "identifier"));
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
