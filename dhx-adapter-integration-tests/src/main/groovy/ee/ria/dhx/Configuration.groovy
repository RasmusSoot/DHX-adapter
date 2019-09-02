package ee.ria.dhx

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.validation.annotation.Validated


@org.springframework.context.annotation.Configuration
@ConfigurationProperties(prefix = "dhx")
@Validated
class Configuration {
    final Hobekuul hobekuul = new Hobekuul();
    final Test test = new Test();
    public static class Hobekuul {
        public String dhxServiceUrl

        String getDhxServiceUrl() {
            return dhxServiceUrl
        }

        void setDhxServiceUrl(String dhxServiceUrl) {
            println "Setting DHX Service URL: " + (System.getenv("DHX_ADAPTER_HOBEKUUL_DHX_SERVICE_URL") ?: dhxServiceUrl)
            this.dhxServiceUrl = System.getenv("DHX_ADAPTER_HOBEKUUL_DHX_SERVICE_URL") ?: dhxServiceUrl
        }

        public String healthUrl

        String getHealthUrl() {
            return healthUrl
        }

        void setHealthUrl(String healthUrl) {
            println "Setting health URL: " + (System.getenv("DHX_ADAPTER_HOBEKUUL_HEALTH_URL") ?: healthUrl)
            this.healthUrl = System.getenv("DHX_ADAPTER_HOBEKUUL_HEALTH_URL") ?: healthUrl
        }
    }

    public static class Test {
        public String dhxServiceUrl

        String getServiceUrl() {
            return dhxServiceUrl
        }

        void setDhxServiceUrl(String dhxServiceUrl) {
            println "Setting Test Service URL: " + (System.getenv("DHX_ADAPTER_TEST_DHX_URL") ?: dhxServiceUrl)
            this.dhxServiceUrl = System.getenv("DHX_ADAPTER_TEST_DHX_URL") ?: dhxServiceUrl
        }

        public String healthUrl

        String getHealthUrl() {
            return healthUrl
        }

        void setHealthUrl(String healthUrl) {
            println "Setting Test Health URL: " + (System.getenv("DHX_ADAPTER_TEST_HEALTH_URL") ?: healthUrl)
            this.healthUrl = System.getenv("DHX_ADAPTER_TEST_HEALTH_URL") ?: healthUrl
        }

        public String monitorUrl

        String getMonitorUrl() {
            return monitorUrl
        }

        void setMonitorUrl(String monitorUrl) {
            println "Setting Test Monitor URL: " + (System.getenv("DHX_ADAPTER_TEST_MONITOR_URL") ?: monitorUrl)
            this.monitorUrl = System.getenv("DHX_ADAPTER_TEST_MONITOR_URL") ?: monitorUrl
        }
    }


}
