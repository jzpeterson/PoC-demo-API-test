package com.mastercontrol.rc.bdd.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddWorkflowResponse {

    @JsonProperty("workflow")
    private Workflow workflow;
}
