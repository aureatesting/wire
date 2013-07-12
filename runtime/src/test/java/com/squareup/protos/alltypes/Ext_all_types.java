/**
 * Code generated by "Wire" protobuf compiler, do not edit.
 * Source file: ../runtime/src/main/proto/all_types.proto
 */
package com.squareup.protos.alltypes;

import com.squareup.wire.Wire;
import java.util.List;

import static com.squareup.wire.Message.ExtendableMessage.Extension;

public final class Ext_all_types {

  private Ext_all_types() {
  }

  public static final Extension<AllTypes, List<Integer>> ext_pack_int32 = Extension.getRepeatedExtension(AllTypes.class, 1001, Wire.INT32, true);
  public static final Extension<AllTypes, List<Integer>> ext_pack_uint32 = Extension.getRepeatedExtension(AllTypes.class, 1002, Wire.UINT32, true);
  public static final Extension<AllTypes, List<Integer>> ext_pack_sint32 = Extension.getRepeatedExtension(AllTypes.class, 1003, Wire.SINT32, true);
  public static final Extension<AllTypes, List<Integer>> ext_pack_fixed32 = Extension.getRepeatedExtension(AllTypes.class, 1004, Wire.FIXED32, true);
  public static final Extension<AllTypes, List<Integer>> ext_pack_sfixed32 = Extension.getRepeatedExtension(AllTypes.class, 1005, Wire.SFIXED32, true);
  public static final Extension<AllTypes, List<Long>> ext_pack_int64 = Extension.getRepeatedExtension(AllTypes.class, 1006, Wire.INT64, true);
  public static final Extension<AllTypes, List<Long>> ext_pack_uint64 = Extension.getRepeatedExtension(AllTypes.class, 1007, Wire.UINT64, true);
  public static final Extension<AllTypes, List<Long>> ext_pack_sint64 = Extension.getRepeatedExtension(AllTypes.class, 1008, Wire.SINT64, true);
  public static final Extension<AllTypes, List<Long>> ext_pack_fixed64 = Extension.getRepeatedExtension(AllTypes.class, 1009, Wire.FIXED64, true);
  public static final Extension<AllTypes, List<Long>> ext_pack_sfixed64 = Extension.getRepeatedExtension(AllTypes.class, 1010, Wire.SFIXED64, true);
  public static final Extension<AllTypes, List<Boolean>> ext_pack_bool = Extension.getRepeatedExtension(AllTypes.class, 1011, Wire.BOOL, true);
  public static final Extension<AllTypes, List<Float>> ext_pack_float = Extension.getRepeatedExtension(AllTypes.class, 1012, Wire.FLOAT, true);
  public static final Extension<AllTypes, List<Double>> ext_pack_double = Extension.getRepeatedExtension(AllTypes.class, 1013, Wire.DOUBLE, true);
  public static final Extension<AllTypes, List<String>> ext_pack_string = Extension.getRepeatedExtension(AllTypes.class, 1014, Wire.STRING, false);
  public static final Extension<AllTypes, List<byte[]>> ext_pack_bytes = Extension.getRepeatedExtension(AllTypes.class, 1015, Wire.BYTES, false);
  public static final Extension<AllTypes, List<AllTypes.NestedEnum>> ext_pack_nested_enum = Extension.getRepeatedEnumExtension(AllTypes.class, 1016, true, AllTypes.NestedEnum.class);
  public static final Extension<AllTypes, List<AllTypes.NestedMessage>> ext_pack_nested_message = Extension.getRepeatedMessageExtension(AllTypes.class, 1017, AllTypes.NestedMessage.class);
}