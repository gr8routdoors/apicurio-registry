package io.apicurio.registry.storage.impl.gitops.model.v0;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Jakub Senko <em>m@jsenko.net</em>
 */
@SuperBuilder
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Version {

    private String id;

    private Long globalId;

    private String contentFile;
}
