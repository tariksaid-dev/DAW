<?php

namespace App\Entity;

use App\Repository\LineRepository;
use Doctrine\ORM\Mapping as ORM;

#[ORM\Entity(repositoryClass: LineRepository::class)]
class Line
{
  #[ORM\Id]
  #[ORM\GeneratedValue]
  #[ORM\Column]
  private ?int $id = null;

  #[ORM\Column]
  private ?int $cantidad = null;

  #[ORM\ManyToOne(inversedBy: 'orderLines')]
  private ?Order $orderLine = null;

  #[ORM\ManyToOne(inversedBy: 'lineas')]
  private ?Product $product = null;

  public function getId(): ?int
  {
    return $this->id;
  }

  public function getCantidad(): ?int
  {
    return $this->cantidad;
  }

  public function setCantidad(int $cantidad): static
  {
    $this->cantidad = $cantidad;

    return $this;
  }


  public function getOrderLine(): ?Order
  {
    return $this->orderLine;
  }

  public function setOrderLine(?Order $orderLine): static
  {
    $this->orderLine = $orderLine;

    return $this;
  }

  public function getProduct(): ?Product
  {
      return $this->product;
  }

  public function setProduct(?Product $product): static
  {
      $this->product = $product;

      return $this;
  }
}
