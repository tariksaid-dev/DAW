import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-ej6',
  templateUrl: './ej6.component.html',
  styleUrl: './ej6.component.css',
})
export class Ej6Component {
  @Input() bg = '';
  @Input() text = '';

  @Output() onClick: EventEmitter<void> = new EventEmitter<void>();
}
