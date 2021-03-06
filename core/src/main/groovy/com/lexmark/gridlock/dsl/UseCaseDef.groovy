/*
 * Copyright 2016 Lexmark International Technology S.A.  All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. If a copy of the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package com.lexmark.gridlock.dsl

class UseCaseDef {
    String name
    String context
    Closure paramSource
    Closure paramSink
    String traceDump
    Closure onActionFailure
    Integer numAllowedFailures

    List<ActionDef> actionTree
    FlowTimingDef flowTiming

    public UseCaseDef(String name, String context) {
        this.name = name
        this.context = context
        this.actionTree = new ArrayList<ActionDef>(20)
        this.flowTiming = new FlowTimingDef(context)
    }

    public void validate() {
        //do nothing?
    }

    private void validateArgs() {

    }
}
