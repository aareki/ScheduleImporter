/**
 * PageRegions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class PageRegions  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.PageRegion[] pageRegion;

    public PageRegions() {
    }

    public PageRegions(
           com.hannonhill.www.ws.ns.AssetOperationService.PageRegion[] pageRegion) {
           this.pageRegion = pageRegion;
    }


    /**
     * Gets the pageRegion value for this PageRegions.
     * 
     * @return pageRegion
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.PageRegion[] getPageRegion() {
        return pageRegion;
    }


    /**
     * Sets the pageRegion value for this PageRegions.
     * 
     * @param pageRegion
     */
    public void setPageRegion(com.hannonhill.www.ws.ns.AssetOperationService.PageRegion[] pageRegion) {
        this.pageRegion = pageRegion;
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.PageRegion getPageRegion(int i) {
        return this.pageRegion[i];
    }

    public void setPageRegion(int i, com.hannonhill.www.ws.ns.AssetOperationService.PageRegion _value) {
        this.pageRegion[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PageRegions)) return false;
        PageRegions other = (PageRegions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pageRegion==null && other.getPageRegion()==null) || 
             (this.pageRegion!=null &&
              java.util.Arrays.equals(this.pageRegion, other.getPageRegion())));
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
        if (getPageRegion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPageRegion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPageRegion(), i);
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
        new org.apache.axis.description.TypeDesc(PageRegions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "page-regions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageRegion"));
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
