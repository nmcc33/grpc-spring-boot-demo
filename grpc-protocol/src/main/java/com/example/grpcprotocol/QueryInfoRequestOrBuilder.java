// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpcprotocol/firstTest.proto

package com.example.grpcprotocol;

public interface QueryInfoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpcprotocol.QueryInfoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *id
   * </pre>
   *
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string school = 2;</code>
   * @return The school.
   */
  java.lang.String getSchool();
  /**
   * <code>string school = 2;</code>
   * @return The bytes for school.
   */
  com.google.protobuf.ByteString
      getSchoolBytes();

  /**
   * <code>bool isBoy = 3;</code>
   * @return The isBoy.
   */
  boolean getIsBoy();

  /**
   * <code>repeated .grpcprotocol.personalInfo personalInfoRecords = 4;</code>
   */
  java.util.List<com.example.grpcprotocol.personalInfo> 
      getPersonalInfoRecordsList();
  /**
   * <code>repeated .grpcprotocol.personalInfo personalInfoRecords = 4;</code>
   */
  com.example.grpcprotocol.personalInfo getPersonalInfoRecords(int index);
  /**
   * <code>repeated .grpcprotocol.personalInfo personalInfoRecords = 4;</code>
   */
  int getPersonalInfoRecordsCount();
  /**
   * <code>repeated .grpcprotocol.personalInfo personalInfoRecords = 4;</code>
   */
  java.util.List<? extends com.example.grpcprotocol.personalInfoOrBuilder> 
      getPersonalInfoRecordsOrBuilderList();
  /**
   * <code>repeated .grpcprotocol.personalInfo personalInfoRecords = 4;</code>
   */
  com.example.grpcprotocol.personalInfoOrBuilder getPersonalInfoRecordsOrBuilder(
      int index);

  /**
   * <code>map&lt;string, string&gt; familyInfo = 5;</code>
   */
  int getFamilyInfoCount();
  /**
   * <code>map&lt;string, string&gt; familyInfo = 5;</code>
   */
  boolean containsFamilyInfo(
      java.lang.String key);
  /**
   * Use {@link #getFamilyInfoMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getFamilyInfo();
  /**
   * <code>map&lt;string, string&gt; familyInfo = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getFamilyInfoMap();
  /**
   * <code>map&lt;string, string&gt; familyInfo = 5;</code>
   */

  java.lang.String getFamilyInfoOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; familyInfo = 5;</code>
   */

  java.lang.String getFamilyInfoOrThrow(
      java.lang.String key);
}
