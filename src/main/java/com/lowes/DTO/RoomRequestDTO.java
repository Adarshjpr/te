package com.lowes.DTO;

import com.lowes.enums.RenovationType;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomRequestDTO {
    private String name;
    private RenovationType renovationType;
    private Long projectId;
}
