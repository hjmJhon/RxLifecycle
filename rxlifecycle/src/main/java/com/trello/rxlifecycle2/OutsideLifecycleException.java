package com.trello.rxlifecycle2;

import javax.annotation.Nullable;

/**
 * This is an exception that can be thrown to indicate that the caller has attempted to bind to a lifecycle outside
 * of its allowable window.
 */
public class OutsideLifecycleException extends IllegalStateException {

    public OutsideLifecycleException() {
    }

    public OutsideLifecycleException(@Nullable String detailMessage) {
        super(detailMessage);
    }
}
