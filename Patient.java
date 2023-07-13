package edu.disease.asn1;
import java.util.UUID;

public class Patient {
	int maxDiseases, maxExposures;
	String firstName, lastName;
	Exposure[] exposure;
	UUID[] diseaseIds;
	Patient(int maxDiseases, int maxExposures)
	{
		if (maxDiseases < 0)
		{
			throw new IllegalArgumentException("Value must be greater than 0");
		}
		else
		{
			this.diseaseIds = new UUID[maxDiseases];
		}
		if (maxExposures < 0)
		{
			throw new IllegalArgumentException("Value must be greater than 0");
		}
		else
		{
			this.exposure = new Exposure[maxExposures];
		}
	}
	void addDiseaseId(UUID id)
	{
		for (int i = 1; i <= diseaseIds.length; i++)
		{
			diseaseIds[i] = id;
		}
	}
	void addExposure(Exposure ex)
	{
		for (int i = 1; i <= maxExposures; i++)
		{
			exposure[i] = ex;
		}
	}
}
