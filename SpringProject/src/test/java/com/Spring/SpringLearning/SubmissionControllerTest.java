package com.Spring.SpringLearning;
import com.Spring.SpringLearning.model.SubmissionDTO;
import com.Spring.SpringLearning.service.SubmissionServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class SubmissionControllerTest {


        @Mock
        private SubmissionServiceImpl submissionService;

        @InjectMocks
        private SubmissionController submissionController;

        @BeforeEach
        public void setup() {
            MockitoAnnotations.openMocks(this);
        }

        @Test
        public void testGetSubmission() {
            // Set up
            String id = "1";
            SubmissionDTO submission = new SubmissionDTO(id);
            when(submissionService.getSubmission(id)).thenReturn(submission);

            // Test
            SubmissionDTO result = submissionController.getSubmission(id);

            // Verify
            verify(submissionService, times(1)).getSubmission(id);
            // Add additional assertions as per your requirements
        }

        @Test
        public void testGetAll() {
            // Set up
            List<SubmissionDTO> submissions = Arrays.asList(
                    new SubmissionDTO("1"),
                    new SubmissionDTO("2")
            );
            when(submissionService.getAll()).thenReturn(submissions);

            // Test
            List<SubmissionDTO> result = submissionController.getAll();

            // Verify
            verify(submissionService, times(1)).getAll();
            // Add additional assertions as per your requirements
        }

        @Test
        public void testAddSubmission() {
            // Set up
            SubmissionDTO submission = new SubmissionDTO("1");
            when(submissionService.addSubmission(any(SubmissionDTO.class))).thenReturn(submission);

            // Test
            SubmissionDTO result = submissionController.addSubmission(submission);

            // Verify
            verify(submissionService, times(1)).addSubmission(any(SubmissionDTO.class));
            // Add additional assertions as per your requirements
        }

        @Test
        public void testUpdateSubmission() {
            // Set up
            SubmissionDTO submission = new SubmissionDTO("1");
            when(submissionService.updateSubmission(any(SubmissionDTO.class))).thenReturn(submission);

            // Test
            SubmissionDTO result = submissionController.updateSubmission(submission);

            // Verify
            verify(submissionService, times(1)).updateSubmission(any(SubmissionDTO.class));
            // Add additional assertions as per your requirements
        }

        @Test
        public void testDeleteSubmission() {
            // Set up
            String id = "1";

            // Test
            submissionController.deleteSubmission(id);

            // Verify
            verify(submissionService, times(1)).deleteSubmission(id);
        }
    }


