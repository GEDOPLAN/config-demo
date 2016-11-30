package de.gedoplan.config.presentation;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

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

  @Inject
  @Config("java.version")
  String javaVersion;
}
