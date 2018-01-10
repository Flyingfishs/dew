package com.ecfront.dew.jdbc.sharding;

import io.shardingjdbc.core.api.ShardingDataSourceFactory;
import io.shardingjdbc.core.yaml.masterslave.YamMasterSlaveRuleConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Master slave rule configuration properties.
 *
 * @author caohao
 */
@ConditionalOnClass(ShardingDataSourceFactory.class)
@ConfigurationProperties(prefix = "sharding.jdbc.config.masterslave")
public class MasterSlaveRuleConfigurationProperties extends YamMasterSlaveRuleConfiguration {
}
