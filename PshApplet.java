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

import java.applet.*;

import org.spiderland.Psh.*;

public class PshApplet extends Applet {
	public static final long serialVersionUID = 2L;


	Interpreter _interpreter = new Interpreter();

	public void init() {
		try {
			System.out.println( Run( getParameter( "program" ) ) );
		} catch( Exception e ) {};
	}

	public String Run( String inValue ) {
		_interpreter.ClearStacks();

		try {
			Program p;
			p = new Program( inValue );

			_interpreter.Execute( p );

		} catch( Exception e ) {

		};

		return _interpreter.toString();
	}

	public String GetInstructionString() {
		return "=> " + _interpreter.GetRegisteredInstructionsString();
	}
}
