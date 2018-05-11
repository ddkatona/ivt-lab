package hu.bme.mit.spaceship;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class GT4500Test {

  private GT4500 ship;
  private TorpedoStore ts1;
  private TorpedoStore ts2;

  @Before
  public void init(){
    ts1 = mock(TorpedoStore.class);
    ts2 = mock(TorpedoStore.class);
    this.ship = new GT4500(ts1, ts2);
  }

  @Test
  public void fireTorpedo_Single_Success(){
    // Arrange
    when(ts1.fire(1)).thenReturn(true);
    // Act
    boolean result = ship.fireTorpedo(FiringMode.SINGLE);

    // Assert
    assertEquals(true, result);
    verify(ts1, times(1)).fire(1);
  }

  @Test
  public void fireTorpedo_All_Success(){
    // Arrange

    // Act
    boolean result = ship.fireTorpedo(FiringMode.ALL);

    // Assert
    assertEquals(true, result);
  }

}
