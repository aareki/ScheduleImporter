/**
 * AssetFactoryPlugins.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class AssetFactoryPlugins  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPlugin[] plugin;

    public AssetFactoryPlugins() {
    }

    public AssetFactoryPlugins(
           com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPlugin[] plugin) {
           this.plugin = plugin;
    }


    /**
     * Gets the plugin value for this AssetFactoryPlugins.
     * 
     * @return plugin
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPlugin[] getPlugin() {
        return plugin;
    }


    /**
     * Sets the plugin value for this AssetFactoryPlugins.
     * 
     * @param plugin
     */
    public void setPlugin(com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPlugin[] plugin) {
        this.plugin = plugin;
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPlugin getPlugin(int i) {
        return this.plugin[i];
    }

    public void setPlugin(int i, com.hannonhill.www.ws.ns.AssetOperationService.AssetFactoryPlugin _value) {
        this.plugin[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssetFactoryPlugins)) return false;
        AssetFactoryPlugins other = (AssetFactoryPlugins) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.plugin==null && other.getPlugin()==null) || 
             (this.plugin!=null &&
              java.util.Arrays.equals(this.plugin, other.getPlugin())));
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
        if (getPlugin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlugin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlugin(), i);
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
        new org.apache.axis.description.TypeDesc(AssetFactoryPlugins.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset-factory-plugins"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plugin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "plugin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "asset-factory-plugin"));
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
