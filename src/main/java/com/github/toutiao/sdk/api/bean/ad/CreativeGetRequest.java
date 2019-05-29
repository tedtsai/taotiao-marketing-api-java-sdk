package com.github.toutiao.sdk.api.bean.ad;

import com.alibaba.fastjson.JSON;
import com.github.toutiao.sdk.api.bean.BaseModel;
import com.github.toutiao.sdk.support.utils.URIUtil;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data
public class CreativeGetRequest extends BaseModel {
    Long advertiser_id;
    Integer page = 1;
    Integer page_size = 1000;
    Filter filtering;

    @Data
    public static class Filter {
        Long campaign_id;
        Long ad_id;
        List<Long> creative_ids;
        List<String> fields;
        String status;
    }


    public String toQueryString() {
        StringBuilder builder = new StringBuilder();
        builder.append("?advertiser_id=").append(advertiser_id);
        builder.append("&page=").append(page);
        builder.append("&page_size=").append(page_size);
        if (!Objects.isNull(filtering)) {
            builder.append("&filtering=").append(URIUtil.encodeURIComponent(JSON.toJSONString(filtering)));
        }
        return builder.toString();
    }
}
