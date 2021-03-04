package com.quan12yt.elasticdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "elastic-demo", indexStoreType = "customer")
public class Customer {

    @Id
    private String id;
    private String name;
    private String address;
    private Integer age;
}
