package com.gamergeo.project.hermes.model.video;


import java.io.Serializable;

import com.gamergeo.project.hermes.model.DatabaseName;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = DatabaseName.VIDEO_TAG.TABLE)
//@Table(name = DatabaseName.TAG.TABLE)
@Data
public class VideoTag implements Serializable {

	private static final long serialVersionUID = 6257375419629830569L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name=DatabaseName.ID)
	protected Long id;

	@Column(name=DatabaseName.VIDEO_TAG.TEXT)
	protected String text;
	
}
