package com.github.toutiao.sdk.api.bean.convert;

import com.github.toutiao.sdk.api.bean.BaseModel;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ConvertStatusRequest extends BaseModel {
    Long advertiser_id;
    Long convert_id;
    String opt_status;
}
