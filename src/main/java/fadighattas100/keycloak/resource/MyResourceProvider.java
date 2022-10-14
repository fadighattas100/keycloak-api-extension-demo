package fadighattas100.keycloak.resource;

import lombok.RequiredArgsConstructor;
import org.keycloak.models.KeycloakSession;
import org.keycloak.services.resource.RealmResourceProvider;


@RequiredArgsConstructor
public class MyResourceProvider implements RealmResourceProvider {

    private final KeycloakSession session;

    public Object getResource() {
        return this;
    }

    public void close() {

    }
}
