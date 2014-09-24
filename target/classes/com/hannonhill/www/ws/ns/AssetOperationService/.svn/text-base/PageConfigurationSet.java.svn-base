/**
 * PageConfigurationSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class PageConfigurationSet  extends com.hannonhill.www.ws.ns.AssetOperationService.ContaineredAsset  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.PageConfigurations pageConfigurations;

    public PageConfigurationSet() {
    }

    public PageConfigurationSet(
           java.lang.String id,
           com.hannonhill.www.ws.ns.AssetOperationService.EntityType entityType,
           java.lang.String name,
           java.lang.String parentContainerId,
           java.lang.String parentContainerPath,
           java.lang.String path,
           java.lang.String siteId,
           java.lang.String siteName,
           com.hannonhill.www.ws.ns.AssetOperationService.PageConfigurations pageConfigurations) {
        super(
            id,
            entityType,
            name,
            parentContainerId,
            parentContainerPath,
            path,
            siteId,
            siteName);
        this.pageConfigurations = pageConfigurations;
    }


    /**
     * Gets the pageConfigurations value for this PageConfigurationSet.
     * 
     * @return pageConfigurations
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.PageConfigurations getPageConfigurations() {
        return pageConfigurations;
    }


    /**
     * Sets the pageConfigurations value for this PageConfigurationSet.
     * 
     * @param pageConfigurations
     */
    public void setPageConfigurations(com.hannonhill.www.ws.ns.AssetOperationService.PageConfigurations pageConfigurations) {
        this.pageConfigurations = pageConfigurations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PageConfigurationSet)) return false;
        PageConfigurationSet other = (PageConfigurationSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pageConfigurations==null && other.getPageConfigurations()==null) || 
             (this.pageConfigurations!=null &&
              this.pageConfigurations.equals(other.getPageConfigurations())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPageConfigurations() != null) {
            _hashCode += getPageConfigurations().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PageConfigurationSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfigurationSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageConfigurations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "pageConfigurations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "page-configurations"));
        elemField.setNillable(false);
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
