package de.gedoplan.config.presentation;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import org.apache.tamaya.ConfigurationProvider;
import org.apache.tamaya.inject.api.Config;

import lombok.Getter;

@Model
@Getter
public class ConfigPresenter {
  @Inject
  @Config(defaultValue = "unknown")
  String companyName;

  @Inject
  @Config
  int answerToLifeUniverseAndEverything;

  public String getJavaVendor() {
    String javaVendor = ConfigurationProvider.getConfiguration().getOrDefault("java.vendor", "unknown");
    return javaVendor;
  }

  @Inject
  @Config("java.version")
  String javaVersion;

  @Inject
  @Config("JAVA_HOME")
  String javaHome;
}
