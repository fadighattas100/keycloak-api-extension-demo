package fadighattas100.keycloak.resource;

import fadighattas100.keycloak.resource.MyResourceProvider;
import org.keycloak.Config;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.services.resource.RealmResourceProvider;
import org.keycloak.services.resource.RealmResourceProviderFactory;

public class MyResourceProviderFactory implements RealmResourceProviderFactory {

    public static final String PROVIDER_ID = "my-rest-resource";

    public RealmResourceProvider create(KeycloakSession keycloakSession) {
        return new MyResourceProvider(keycloakSession);
    }

    public void init(Config.Scope config) {

    }

    public void postInit(KeycloakSessionFactory factory) {

    }

    public void close() {

    }

    public String getId() {
        return PROVIDER_ID;
    }
}
