package com.cospro.version04.question04;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class Pair<T1, T2> {
    Integer key;
    Integer value;
}
