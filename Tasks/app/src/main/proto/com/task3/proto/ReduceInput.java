// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: communicate.proto

package com.task3.proto;

/**
 * Protobuf type {@code filesystem.ReduceInput}
 */
public final class ReduceInput extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:filesystem.ReduceInput)
    ReduceInputOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReduceInput.newBuilder() to construct.
  private ReduceInput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReduceInput() {
    ip_ = "";
    inputfilepath_ = "";
    outputfilepath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReduceInput();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.task3.proto.Communicate.internal_static_filesystem_ReduceInput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.task3.proto.Communicate.internal_static_filesystem_ReduceInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.task3.proto.ReduceInput.class, com.task3.proto.ReduceInput.Builder.class);
  }

  public static final int IP_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ip_ = "";
  /**
   * <code>string ip = 1;</code>
   * @return The ip.
   */
  @java.lang.Override
  public java.lang.String getIp() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ip_ = s;
      return s;
    }
  }
  /**
   * <code>string ip = 1;</code>
   * @return The bytes for ip.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIpBytes() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ip_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PORT_FIELD_NUMBER = 2;
  private int port_ = 0;
  /**
   * <code>int32 port = 2;</code>
   * @return The port.
   */
  @java.lang.Override
  public int getPort() {
    return port_;
  }

  public static final int INPUTFILEPATH_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object inputfilepath_ = "";
  /**
   * <code>string inputfilepath = 4;</code>
   * @return The inputfilepath.
   */
  @java.lang.Override
  public java.lang.String getInputfilepath() {
    java.lang.Object ref = inputfilepath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inputfilepath_ = s;
      return s;
    }
  }
  /**
   * <code>string inputfilepath = 4;</code>
   * @return The bytes for inputfilepath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInputfilepathBytes() {
    java.lang.Object ref = inputfilepath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      inputfilepath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OUTPUTFILEPATH_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object outputfilepath_ = "";
  /**
   * <code>string outputfilepath = 5;</code>
   * @return The outputfilepath.
   */
  @java.lang.Override
  public java.lang.String getOutputfilepath() {
    java.lang.Object ref = outputfilepath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      outputfilepath_ = s;
      return s;
    }
  }
  /**
   * <code>string outputfilepath = 5;</code>
   * @return The bytes for outputfilepath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOutputfilepathBytes() {
    java.lang.Object ref = outputfilepath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      outputfilepath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ip_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ip_);
    }
    if (port_ != 0) {
      output.writeInt32(2, port_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inputfilepath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, inputfilepath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outputfilepath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, outputfilepath_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ip_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ip_);
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, port_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inputfilepath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, inputfilepath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outputfilepath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, outputfilepath_);
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
    if (!(obj instanceof com.task3.proto.ReduceInput)) {
      return super.equals(obj);
    }
    com.task3.proto.ReduceInput other = (com.task3.proto.ReduceInput) obj;

    if (!getIp()
        .equals(other.getIp())) return false;
    if (getPort()
        != other.getPort()) return false;
    if (!getInputfilepath()
        .equals(other.getInputfilepath())) return false;
    if (!getOutputfilepath()
        .equals(other.getOutputfilepath())) return false;
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
    hash = (37 * hash) + IP_FIELD_NUMBER;
    hash = (53 * hash) + getIp().hashCode();
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (37 * hash) + INPUTFILEPATH_FIELD_NUMBER;
    hash = (53 * hash) + getInputfilepath().hashCode();
    hash = (37 * hash) + OUTPUTFILEPATH_FIELD_NUMBER;
    hash = (53 * hash) + getOutputfilepath().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.task3.proto.ReduceInput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.task3.proto.ReduceInput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.task3.proto.ReduceInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.task3.proto.ReduceInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.task3.proto.ReduceInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.task3.proto.ReduceInput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.task3.proto.ReduceInput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.task3.proto.ReduceInput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.task3.proto.ReduceInput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.task3.proto.ReduceInput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.task3.proto.ReduceInput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.task3.proto.ReduceInput parseFrom(
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
  public static Builder newBuilder(com.task3.proto.ReduceInput prototype) {
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
   * Protobuf type {@code filesystem.ReduceInput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:filesystem.ReduceInput)
      com.task3.proto.ReduceInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.task3.proto.Communicate.internal_static_filesystem_ReduceInput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.task3.proto.Communicate.internal_static_filesystem_ReduceInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.task3.proto.ReduceInput.class, com.task3.proto.ReduceInput.Builder.class);
    }

    // Construct using com.task3.proto.ReduceInput.newBuilder()
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
      ip_ = "";
      port_ = 0;
      inputfilepath_ = "";
      outputfilepath_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.task3.proto.Communicate.internal_static_filesystem_ReduceInput_descriptor;
    }

    @java.lang.Override
    public com.task3.proto.ReduceInput getDefaultInstanceForType() {
      return com.task3.proto.ReduceInput.getDefaultInstance();
    }

    @java.lang.Override
    public com.task3.proto.ReduceInput build() {
      com.task3.proto.ReduceInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.task3.proto.ReduceInput buildPartial() {
      com.task3.proto.ReduceInput result = new com.task3.proto.ReduceInput(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.task3.proto.ReduceInput result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ip_ = ip_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.port_ = port_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.inputfilepath_ = inputfilepath_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.outputfilepath_ = outputfilepath_;
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
      if (other instanceof com.task3.proto.ReduceInput) {
        return mergeFrom((com.task3.proto.ReduceInput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.task3.proto.ReduceInput other) {
      if (other == com.task3.proto.ReduceInput.getDefaultInstance()) return this;
      if (!other.getIp().isEmpty()) {
        ip_ = other.ip_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      if (!other.getInputfilepath().isEmpty()) {
        inputfilepath_ = other.inputfilepath_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getOutputfilepath().isEmpty()) {
        outputfilepath_ = other.outputfilepath_;
        bitField0_ |= 0x00000008;
        onChanged();
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
            case 10: {
              ip_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              port_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 34: {
              inputfilepath_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 34
            case 42: {
              outputfilepath_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 42
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

    private java.lang.Object ip_ = "";
    /**
     * <code>string ip = 1;</code>
     * @return The ip.
     */
    public java.lang.String getIp() {
      java.lang.Object ref = ip_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ip_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ip = 1;</code>
     * @return The bytes for ip.
     */
    public com.google.protobuf.ByteString
        getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ip = 1;</code>
     * @param value The ip to set.
     * @return This builder for chaining.
     */
    public Builder setIp(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ip_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string ip = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIp() {
      ip_ = getDefaultInstance().getIp();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string ip = 1;</code>
     * @param value The bytes for ip to set.
     * @return This builder for chaining.
     */
    public Builder setIpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ip_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int port_ ;
    /**
     * <code>int32 port = 2;</code>
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
    }
    /**
     * <code>int32 port = 2;</code>
     * @param value The port to set.
     * @return This builder for chaining.
     */
    public Builder setPort(int value) {

      port_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 port = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPort() {
      bitField0_ = (bitField0_ & ~0x00000002);
      port_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object inputfilepath_ = "";
    /**
     * <code>string inputfilepath = 4;</code>
     * @return The inputfilepath.
     */
    public java.lang.String getInputfilepath() {
      java.lang.Object ref = inputfilepath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inputfilepath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string inputfilepath = 4;</code>
     * @return The bytes for inputfilepath.
     */
    public com.google.protobuf.ByteString
        getInputfilepathBytes() {
      java.lang.Object ref = inputfilepath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inputfilepath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string inputfilepath = 4;</code>
     * @param value The inputfilepath to set.
     * @return This builder for chaining.
     */
    public Builder setInputfilepath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      inputfilepath_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string inputfilepath = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearInputfilepath() {
      inputfilepath_ = getDefaultInstance().getInputfilepath();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string inputfilepath = 4;</code>
     * @param value The bytes for inputfilepath to set.
     * @return This builder for chaining.
     */
    public Builder setInputfilepathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      inputfilepath_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object outputfilepath_ = "";
    /**
     * <code>string outputfilepath = 5;</code>
     * @return The outputfilepath.
     */
    public java.lang.String getOutputfilepath() {
      java.lang.Object ref = outputfilepath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        outputfilepath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string outputfilepath = 5;</code>
     * @return The bytes for outputfilepath.
     */
    public com.google.protobuf.ByteString
        getOutputfilepathBytes() {
      java.lang.Object ref = outputfilepath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        outputfilepath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string outputfilepath = 5;</code>
     * @param value The outputfilepath to set.
     * @return This builder for chaining.
     */
    public Builder setOutputfilepath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      outputfilepath_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string outputfilepath = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearOutputfilepath() {
      outputfilepath_ = getDefaultInstance().getOutputfilepath();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string outputfilepath = 5;</code>
     * @param value The bytes for outputfilepath to set.
     * @return This builder for chaining.
     */
    public Builder setOutputfilepathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      outputfilepath_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:filesystem.ReduceInput)
  }

  // @@protoc_insertion_point(class_scope:filesystem.ReduceInput)
  private static final com.task3.proto.ReduceInput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.task3.proto.ReduceInput();
  }

  public static com.task3.proto.ReduceInput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReduceInput>
      PARSER = new com.google.protobuf.AbstractParser<ReduceInput>() {
    @java.lang.Override
    public ReduceInput parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReduceInput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReduceInput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.task3.proto.ReduceInput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

