<?php

namespace App\Entity;

use App\Repository\CommentRepository;
use Doctrine\DBAL\Types\Types;
use Doctrine\ORM\Mapping as ORM;

#[ORM\Entity(repositoryClass: CommentRepository::class)]
class Comment
{
  #[ORM\Id]
  #[ORM\GeneratedValue]
  #[ORM\Column]
  private ?int $id = null;

  #[ORM\Column(type: Types::DATE_MUTABLE)]
  private ?\DateTimeInterface $date = null;

  #[ORM\Column(length: 255)]
  private ?string $text = null;

  #[ORM\Column(type: Types::SMALLINT)]
  private ?int $status = null;

  #[ORM\ManyToOne(inversedBy: 'comments')]
  private ?User $user = null;

  #[ORM\ManyToOne(inversedBy: 'comments')]
  private ?Tema $tema = null;

  #[ORM\Column(length: 255)]
  private ?string $imagen = null;

  public function getId(): ?int
  {
    return $this->id;
  }

  public function getDate(): ?\DateTimeInterface
  {
    return $this->date;
  }

  public function setDate(\DateTimeInterface $date): static
  {
    $this->date = $date;

    return $this;
  }

  public function getText(): ?string
  {
    return $this->text;
  }

  public function setText(string $text): static
  {
    $this->text = $text;

    return $this;
  }

  public function getStatus(): ?int
  {
    return $this->status;
  }

  public function setStatus(int $status): static
  {
    $this->status = $status;

    return $this;
  }

  public function getUser(): ?User
  {
    return $this->user;
  }

  public function setUser(?User $user): static
  {
    $this->user = $user;

    return $this;
  }

  public function getTema(): ?Tema
  {
    return $this->tema;
  }

  public function setTema(?Tema $tema): static
  {
    $this->tema = $tema;

    return $this;
  }

  public function getImagen(): ?string
  {
    return $this->imagen;
  }

  public function setImagen(string $imagen): static
  {
    $this->imagen = $imagen;

    return $this;
  }
}
