<?php

namespace App\Entity;

use App\Repository\ProductRepository;
use Doctrine\Common\Collections\ArrayCollection;
use Doctrine\Common\Collections\Collection;
use Doctrine\ORM\Mapping as ORM;

#[ORM\Entity(repositoryClass: ProductRepository::class)]
class Product
{
  #[ORM\Id]
  #[ORM\GeneratedValue]
  #[ORM\Column]
  private ?int $id = null;

  #[ORM\Column(length: 255)]
  private ?string $name = null;

  #[ORM\Column(length: 255)]
  private ?string $description = null;

  #[ORM\Column]
  private ?float $price = null;

  #[ORM\OneToMany(mappedBy: 'product', targetEntity: Line::class)]
  private Collection $lineas;

  public function __construct()
  {
      $this->lineas = new ArrayCollection();
  }

  public function getId(): ?int
  {
    return $this->id;
  }

  public function getName(): ?string
  {
    return $this->name;
  }

  public function setName(string $name): static
  {
    $this->name = $name;

    return $this;
  }

  public function getDescription(): ?string
  {
    return $this->description;
  }

  public function setDescription(string $description): static
  {
    $this->description = $description;

    return $this;
  }

  public function getPrice(): ?float
  {
    return $this->price;
  }

  public function setPrice(float $price): static
  {
    $this->price = $price;

    return $this;
  }

  /**
   * @return Collection<int, Line>
   */
  public function getLineas(): Collection
  {
      return $this->lineas;
  }

  public function addLinea(Line $linea): static
  {
      if (!$this->lineas->contains($linea)) {
          $this->lineas->add($linea);
          $linea->setProduct($this);
      }

      return $this;
  }

  public function removeLinea(Line $linea): static
  {
      if ($this->lineas->removeElement($linea)) {
          // set the owning side to null (unless already changed)
          if ($linea->getProduct() === $this) {
              $linea->setProduct(null);
          }
      }

      return $this;
  }
}
