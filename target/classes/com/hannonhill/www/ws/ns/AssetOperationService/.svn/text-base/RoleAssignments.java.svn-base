/**
 * RoleAssignments.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hannonhill.www.ws.ns.AssetOperationService;

public class RoleAssignments  implements java.io.Serializable {
    private com.hannonhill.www.ws.ns.AssetOperationService.RoleAssignment[] roleAssignment;

    public RoleAssignments() {
    }

    public RoleAssignments(
           com.hannonhill.www.ws.ns.AssetOperationService.RoleAssignment[] roleAssignment) {
           this.roleAssignment = roleAssignment;
    }


    /**
     * Gets the roleAssignment value for this RoleAssignments.
     * 
     * @return roleAssignment
     */
    public com.hannonhill.www.ws.ns.AssetOperationService.RoleAssignment[] getRoleAssignment() {
        return roleAssignment;
    }


    /**
     * Sets the roleAssignment value for this RoleAssignments.
     * 
     * @param roleAssignment
     */
    public void setRoleAssignment(com.hannonhill.www.ws.ns.AssetOperationService.RoleAssignment[] roleAssignment) {
        this.roleAssignment = roleAssignment;
    }

    public com.hannonhill.www.ws.ns.AssetOperationService.RoleAssignment getRoleAssignment(int i) {
        return this.roleAssignment[i];
    }

    public void setRoleAssignment(int i, com.hannonhill.www.ws.ns.AssetOperationService.RoleAssignment _value) {
        this.roleAssignment[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoleAssignments)) return false;
        RoleAssignments other = (RoleAssignments) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.roleAssignment==null && other.getRoleAssignment()==null) || 
             (this.roleAssignment!=null &&
              java.util.Arrays.equals(this.roleAssignment, other.getRoleAssignment())));
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
        if (getRoleAssignment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoleAssignment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoleAssignment(), i);
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
        new org.apache.axis.description.TypeDesc(RoleAssignments.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "role-assignments"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleAssignment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "roleAssignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.hannonhill.com/ws/ns/AssetOperationService", "role-assignment"));
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
