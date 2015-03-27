package app;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.mockito.Matchers.*;

import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNot.*;
import static org.hamcrest.core.IsEqual.*;
import static org.hamcrest.CoreMatchers.instanceOf;

public class HymnControllerTest {

	@Test
	public void IHaveATest_ItDoesntTestAnything_ReturnsTrue() {
		assertThat(1, is(equalTo(1)));
	}
	
}
