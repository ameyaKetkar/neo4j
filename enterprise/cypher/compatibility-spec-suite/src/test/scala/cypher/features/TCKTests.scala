/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package cypher.features

import java.nio.file.FileSystems

import org.junit.jupiter.api.AfterEach
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import org.opencypher.tools.tck.api.{CypherTCK, Scenario}

@RunWith(classOf[JUnitPlatform])
class TCKTests extends BaseFeatureTest {

  // these two should be empty on commit!
  override val featureToRun = ""
  override val scenarioToRun = ""

  override val scenarios: Seq[Scenario] = {
    val allScenarios: Seq[Scenario] = CypherTCK.allTckScenarios
    filterScenarios(allScenarios)
  }

  @AfterEach
  def tearDown(): Unit = {
    //TODO: This method can be removed with new release of TCK (1.0.0-M10)
    FileSystems.getFileSystem(CypherTCK.getClass.getResource(CypherTCK.featuresPath).toURI).close()
  }
}