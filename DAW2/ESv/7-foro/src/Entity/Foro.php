<?php

namespace App\Entity;

use App\Repository\ForoRepository;
use Doctrine\Common\Collections\ArrayCollection;
use Doctrine\Common\Collections\Collection;
use Doctrine\ORM\Mapping as ORM;

#[ORM\Entity(repositoryClass: ForoRepository::class)]
class Foro
{
    #[ORM\Id]
    #[ORM\GeneratedValue]
    #[ORM\Column]
    private ?int $id = null;

    #[ORM\Column(length: 255)]
    private ?string $name = null;

    #[ORM\OneToMany(mappedBy: 'foro', targetEntity: Tema::class)]
    private Collection $tema;

    public function __construct()
    {
        $this->tema = new ArrayCollection();
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

    /**
     * @return Collection<int, Tema>
     */
    public function getTema(): Collection
    {
        return $this->tema;
    }

    public function addTema(Tema $tema): static
    {
        if (!$this->tema->contains($tema)) {
            $this->tema->add($tema);
            $tema->setForo($this);
        }

        return $this;
    }

    public function removeTema(Tema $tema): static
    {
        if ($this->tema->removeElement($tema)) {
            // set the owning side to null (unless already changed)
            if ($tema->getForo() === $this) {
                $tema->setForo(null);
            }
        }

        return $this;
    }
}
