<?php
class Playlist
{
  private $id, $title, $creatorId, $songs;
  // duration

  public function __construct($data)
  {
    $this->id = $data["id"];
    $this->title = $data["title"];
    $this->creatorId = $data["creator_id"];
    $this->songs = SongRepository::getPlaylistSongsByPlaylistId($this->id);
  }

  public function getId()
  {
    return $this->id;
  }

  public function getCreatorId()
  {
    return $this->creatorId;
  }

  public function getTitle()
  {
    return $this->title;
  }

  public function getSongs()
  {
    return $this->songs;
  }

  public function getPlaylistDuration()
  {
    $duration = 0;

    foreach ($this->songs as $song) {
      $duration += $song->getDuration();
    }
    $minutes = floor($duration / 60);
    $seconds = $duration % 60;
    $formatedDuration = sprintf('%02d:%02d', $minutes, $seconds);

    return $formatedDuration;
  }
}
