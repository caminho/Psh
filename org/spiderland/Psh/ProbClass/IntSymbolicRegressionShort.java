/*
 * Copyright 2009-2010 Jon Klein
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.spiderland.Psh.ProbClass;

import org.spiderland.Psh.GAIndividual;
import org.spiderland.Psh.GATestCase;
import org.spiderland.Psh.Interpreter;
import org.spiderland.Psh.ObjectPair;
import org.spiderland.Psh.Program;
import org.spiderland.Psh.PushGP;
import org.spiderland.Psh.PushGPIndividual;
import org.spiderland.Psh.intStack;
import org.spiderland.Psh.TestCase.TestCaseGenerator;

/**
 * This problem class implements symbolic regression for integers. See also
 * IntSymbolicRegression for integer symbolic regression.
 */
public class IntSymbolicRegressionShort extends IntSymbolicRegression {
	private static final long serialVersionUID = 1L;

	protected String Report() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(this._generationCount);
		sb.append(" ").append(this._averageSize);
		sb.append(" ").append(this._bestSize);
		sb.append(" ").append(this._populationMeanFitness);
		sb.append(" ").append(this._bestMeanFitness);
		sb.append(" ").append(this._bestMeanFitnessOfRun);
		sb.append("\n");
		
		return sb.toString();
	}

	protected String FinalReport() {
		return "";
	}
}
