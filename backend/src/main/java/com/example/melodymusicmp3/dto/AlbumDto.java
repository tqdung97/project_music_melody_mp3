package com.example.melodymusicmp3.dto;
import lombok.*;
import org.springframework.security.core.userdetails.User;
import com.example.melodymusicmp3.entity.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class AlbumDto {
    private Long id;
    private String name;
    private Date creationTime;
    private Long numberOfView;
    private List<Singer> singers;
    private User user;
}
