// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: communicate.proto

package com.task3.proto;

/**
 * Protobuf type {@code filesystem.ReduceOutput}
 */
public final class ReduceOutput extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:filesystem.ReduceOutput)
    ReduceOutputOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReduceOutput.newBuilder() to construct.
  private ReduceOutput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReduceOutput() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReduceOutput();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.task3.proto.Communicate.internal_static_filesystem_ReduceOutput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.task3.proto.Communicate.internal_static_filesystem_ReduceOutput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.task3.proto.ReduceOutput.class, com.task3.proto.ReduceOutput.Builder.class);
  }

  public static final int JOBSTATUS_FIELD_NUMBER = 1;
  private int jobstatus_ = 0;
  /**
   * <code>int32 jobstatus = 1;</code>
   * @return The jobstatus.
   */
  @java.lang.Override
  public int getJobstatus() {
    return jobstatus_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (jobstatus_ != 0) {
      output.writeInt32(1, jobstatus_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (jobstatus_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, jobstatus_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.task3.proto.ReduceOutput)) {
      return super.equals(obj);
    }
    com.task3.proto.ReduceOutput other = (com.task3.proto.ReduceOutput) obj;

    if (getJobstatus()
        != other.getJobstatus()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + JOBSTATUS_FIELD_NUMBER;
    hash = (53 * hash) + getJobstatus();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.task3.proto.ReduceOutput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.task3.proto.ReduceOutput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.task3.proto.ReduceOutput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.task3.proto.ReduceOutput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.task3.proto.ReduceOutput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.task3.proto.ReduceOutput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.task3.proto.ReduceOutput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.task3.proto.ReduceOutput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.task3.proto.ReduceOutput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.task3.proto.ReduceOutput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.task3.proto.ReduceOutput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.task3.proto.ReduceOutput parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.task3.proto.ReduceOutput prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code filesystem.ReduceOutput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:filesystem.ReduceOutput)
      com.task3.proto.ReduceOutputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.task3.proto.Communicate.internal_static_filesystem_ReduceOutput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.task3.proto.Communicate.internal_static_filesystem_ReduceOutput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.task3.proto.ReduceOutput.class, com.task3.proto.ReduceOutput.Builder.class);
    }

    // Construct using com.task3.proto.ReduceOutput.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      jobstatus_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.task3.proto.Communicate.internal_static_filesystem_ReduceOutput_descriptor;
    }

    @java.lang.Override
    public com.task3.proto.ReduceOutput getDefaultInstanceForType() {
      return com.task3.proto.ReduceOutput.getDefaultInstance();
    }

    @java.lang.Override
    public com.task3.proto.ReduceOutput build() {
      com.task3.proto.ReduceOutput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.task3.proto.ReduceOutput buildPartial() {
      com.task3.proto.ReduceOutput result = new com.task3.proto.ReduceOutput(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.task3.proto.ReduceOutput result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.jobstatus_ = jobstatus_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.task3.proto.ReduceOutput) {
        return mergeFrom((com.task3.proto.ReduceOutput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.task3.proto.ReduceOutput other) {
      if (other == com.task3.proto.ReduceOutput.getDefaultInstance()) return this;
      if (other.getJobstatus() != 0) {
        setJobstatus(other.getJobstatus());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              jobstatus_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int jobstatus_ ;
    /**
     * <code>int32 jobstatus = 1;</code>
     * @return The jobstatus.
     */
    @java.lang.Override
    public int getJobstatus() {
      return jobstatus_;
    }
    /**
     * <code>int32 jobstatus = 1;</code>
     * @param value The jobstatus to set.
     * @return This builder for chaining.
     */
    public Builder setJobstatus(int value) {

      jobstatus_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 jobstatus = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJobstatus() {
      bitField0_ = (bitField0_ & ~0x00000001);
      jobstatus_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:filesystem.ReduceOutput)
  }

  // @@protoc_insertion_point(class_scope:filesystem.ReduceOutput)
  private static final com.task3.proto.ReduceOutput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.task3.proto.ReduceOutput();
  }

  public static com.task3.proto.ReduceOutput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReduceOutput>
      PARSER = new com.google.protobuf.AbstractParser<ReduceOutput>() {
    @java.lang.Override
    public ReduceOutput parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ReduceOutput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReduceOutput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.task3.proto.ReduceOutput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

