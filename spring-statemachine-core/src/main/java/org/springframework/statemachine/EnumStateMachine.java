/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.statemachine;

import java.util.Collection;

import org.springframework.messaging.Message;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.support.AbstractStateMachine;
import org.springframework.statemachine.transition.Transition;

/**
 * Specialisation of a {@link StateMachine} using enums
 * as its {@link State} and event types.
 *
 * @author Janne Valkealahti
 *
 * @param <S> the type of state
 * @param <E> the type of event
 */
public class EnumStateMachine<S extends Enum<S>, E extends Enum<E>> extends AbstractStateMachine<S, E> {

	/**
	 * Instantiates a new enum state machine.
	 *
	 * @param states the states
	 * @param transitions the transitions
	 * @param initialState the initial state
	 */
	public EnumStateMachine(Collection<State<S, E>> states, Collection<Transition<S, E>> transitions,
			State<S, E> initialState, State<S, E> endState) {
		super(states, transitions, initialState, endState);
	}

	public EnumStateMachine(Collection<State<S, E>> states, Collection<Transition<S, E>> transitions,
			State<S, E> initialState, Transition<S, E> initialTransition, State<S, E> endState,
			Message<E> initialEvent, ExtendedState extendedState) {
		super(states, transitions, initialState, initialTransition, endState, initialEvent, extendedState);
	}

}
