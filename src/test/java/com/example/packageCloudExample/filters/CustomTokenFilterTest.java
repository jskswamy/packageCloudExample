package com.example.packageCloudExample.filters;

import org.apache.lucene.analysis.TokenStream;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;


public class CustomTokenFilterTest {

    @Test
    public void shouldBeAbleToCreateFloorMinimumLengthFilter() throws IOException {
        TokenStream tokenStreamMock = mock(TokenStream.class);

        CustomTokenFilter customTokenFilter = new CustomTokenFilter(tokenStreamMock);

        assertThat(customTokenFilter.incrementToken(), is(equalTo(false)));
    }
}
