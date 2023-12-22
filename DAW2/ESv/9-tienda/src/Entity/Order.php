<?php

namespace App\Entity;

use App\Repository\OrderRepository;
use Doctrine\Common\Collections\ArrayCollection;
use Doctrine\Common\Collections\Collection;
use Doctrine\DBAL\Types\Types;
use Doctrine\ORM\Mapping as ORM;

#[ORM\Entity(repositoryClass: OrderRepository::class)]
#[ORM\Table(name: '`order`')]
class Order
{
  #[ORM\Id]
  #[ORM\GeneratedValue]
  #[ORM\Column]
  private ?int $id = null;

  #[ORM\Column(type: Types::DATE_MUTABLE)]
  private ?\DateTimeInterface $date = null;

  #[ORM\Column(type: Types::SMALLINT)]
  private ?int $state = null;

  #[ORM\OneToMany(mappedBy: 'orderLine', targetEntity: Line::class)]
  private Collection $orderLines;

  #[ORM\ManyToOne(inversedBy: 'relationOrder')]
  #[ORM\JoinColumn(nullable: false)]
  private ?User $user = null;


  public function __construct()
  {
    $this->orderLines = new ArrayCollection();
  }

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

  public function getState(): ?int
  {
    return $this->state;
  }

  public function setState(int $state): static
  {
    $this->state = $state;

    return $this;
  }

  /**
   * @return Collection<int, Line>
   */
  public function getOrderLines(): Collection
  {
    return $this->orderLines;
  }

  public function addOrderLine(Line $orderLine): static
  {
    if (!$this->orderLines->contains($orderLine)) {
      $this->orderLines->add($orderLine);
      $orderLine->setOrderLine($this);
    }

    return $this;
  }

  public function removeOrderLine(Line $orderLine): static
  {
    if ($this->orderLines->removeElement($orderLine)) {
      // set the owning side to null (unless already changed)
      if ($orderLine->getOrderLine() === $this) {
        $orderLine->setOrderLine(null);
      }
    }

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
}
