package no.hvl.dat110.nrf.staticrouting;

public class Segment {

	private String payload;

	public Segment(String payload) {
		super();
		this.payload = payload;
	}

	public String getPayload() {
		return payload;
	}
	
	public Segment clone() {

		// TODO: consider cloning payload
		return new Segment(this.payload);

	}

	public byte[] getBytes() {
		return payload.getBytes();
	}
	
	@Override
	public String toString() {
		return "Segment [payload=" + payload + "]";
	}
	
	
}
