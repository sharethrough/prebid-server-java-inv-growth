package org.prebid.server.hooks.v1;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.Accessors;
import org.prebid.server.hooks.v1.analytics.Tags;

import java.util.List;

@Accessors(fluent = true)
@Builder
@Value
public class InvocationResultImpl<PAYLOAD> implements InvocationResult<PAYLOAD> {

    InvocationStatus status;

    String message;

    InvocationAction action;

    PayloadUpdate<PAYLOAD> payloadUpdate;

    List<String> errors;

    List<String> warnings;

    List<String> debugMessages;

    Object moduleContext;

    Tags analyticsTags;
}
