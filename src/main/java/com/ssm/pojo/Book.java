package com.ssm.pojo;

/**
 * @author jitwxs
 * @date 2021Äê04ÔÂ27ÈÕ 16:29
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

        private int bId;
        private String bName;
        private int bCount;
        private String bDeatil;

}
