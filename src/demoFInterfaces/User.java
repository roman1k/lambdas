package demoFInterfaces;

import lombok.*;

//@Getter
//@Setter
//@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
//@ToString
//@EqualsAndHashCode
@Data
public class User {
    @NonNull
    private int id;
    @NonNull
    private String name;
    private boolean status;
}
